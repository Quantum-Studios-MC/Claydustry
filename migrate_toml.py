import pathlib, shutil, subprocess
root = pathlib.Path(__file__).parent
index_dir = root / "minecraft" / "mods" / ".index"
meta_dir = root / "metadata" / "mods"
meta_dir.mkdir(parents=True, exist_ok=True)
for toml in index_dir.glob("*.pw.toml"):
    dest = meta_dir / toml.name
    if not dest.exists():
        shutil.copy2(toml, dest)
        subprocess.run(["git", "add", str(dest)])
# remove jars from git (if any)
for jar in root.glob("minecraft/mods/*.jar"):
    subprocess.run(["git", "rm", "-f", str(jar)])
subprocess.run(["git", "commit", "-m", "move toml index to metadata and remove jar files"], check=False)
print("migration complete")
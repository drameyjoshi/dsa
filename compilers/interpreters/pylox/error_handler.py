import sys


def report(lineno: int, filename: str, message: str) -> None:
    print(f"{filename}: {lineno} {message}", file=sys.stderr)

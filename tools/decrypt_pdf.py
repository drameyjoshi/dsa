"""
A utility to decrypt PDF files.
"""
import logging
import argparse
import os
import getpass
import sys

from pypdf import (
    PdfReader,
    PdfWriter)

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__file__)
parser = argparse.ArgumentParser()
parser.add_argument(
    "-f",
    "--file",
    type=str,
    help="name of PDF to be decrypted.")

args = parser.parse_args()
if args.file:
    if os.path.exists(args.file):
        reader = PdfReader(args.file)

        if reader.is_encrypted:
            pwd = getpass.getpass(prompt=f"Password for {args.file}:")
            reader.decrypt(pwd)

        FNAME = f"{os.path.basename(args.file).split('.')[0]}_decrypted.pdf"
        logger.info("%s is decrypted to %s.", args.file, FNAME)
        with open(FNAME, "wb") as f:
            PdfWriter(clone_from=reader).write(f)
    else:
        logger.warning(
            "The directory %s does not exist or is not readable.",
            args.dir)
else:
    parser.print_help(sys.stderr)

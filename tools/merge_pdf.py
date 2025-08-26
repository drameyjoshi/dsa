"""
A utility to merge PDF files.
"""
import logging
import os
import sys
import argparse

from pypdf import PdfWriter

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__file__)
parser = argparse.ArgumentParser()
parser.add_argument(
    "-d",
    "--dir",
    type=str,
    help="directory containing PDFs to be merged.")
parser.add_argument(
    "-o",
    "--output",
    type=str,
    help="name of the merged file. If not specified, it will be merged.pdf.")

args = parser.parse_args()
if args.dir:
    if os.path.exists(args.dir):
        logger.info("Scanning %s for pdf files.", args.dir)
        merger = PdfWriter()
        _ = [
            merger.append(pdf) for pdf in [
                f for f in os.listdir(
                    args.dir) if f.lower().endswith(".pdf")]]
        output = args.output or "merged.pdf"
        logger.info("Combining PDFs into %s.", output)
        merger.write(output)
        merger.close()
    else:
        logger.warning(
            "The directory %s does not exist or is not readable.",
            args.dir)
else:
    parser.print_help(sys.stderr)

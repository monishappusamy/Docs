""" Execute a windows command prompt command"""

import subprocess

# I am performing here a "mvn robotframework:run" command in command line
process = subprocess.call(["mvn", "robotframework:run"], shell=True)

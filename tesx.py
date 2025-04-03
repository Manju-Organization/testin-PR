import configparser

# Create a ConfigParser object
config = configparser.ConfigParser()

# Read the INI file
config.read("config.ini")

# Access values
print("Database Host:", config["Database"]["host"])
print("Database Port:", config["Database"]["port"])
print("Logging Level:", config["Logging"]["level"])
print("Log File Path:", config["Logging"]["file"])

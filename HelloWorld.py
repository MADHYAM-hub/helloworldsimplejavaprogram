import requests

url = "https://api.github.com/repos/MADHYAM-hub/helloworldsimplejavaprogram"

response = requests.get(url)

print(response.status_code)

data = response.json()

print(data["full_name"])
print(data["language"])
print(data["visibility"])
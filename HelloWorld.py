import requests

try:
    response = requests.get(
        "https://api.github.com/repos/MADHYAM-hub/helloworldsimplejavaprogram"
    )
    response.raise_for_status()
except requests.exceptions.HTTPError as error:
    print(f"HTTP error {error.response.status_code}: {error}")
else:
    print(response.status_code)

    data = response.json()

    print(data["full_name"])
    print(data["language"])
    print(data["visibility"])

people = [
    {"name": "Vikas", "age": 39, "role": "Founder"},
    {"name": "Alice", "age": 5, "role": "AI Co-Pilot"},
    {"name": "Sample Developer", "age": 28, "role": "Developer"},
]

for person in people:
    print(f"Name: {person['name']}, Age: {person['age']}, Role: {person['role']}")

adult_names = []

for person in people:
    if person["age"] >= 18:
        adult_names.append(person["name"])

print(f"Adults: {', '.join(adult_names)}")

for person in people:
    if person["age"] >= 18:
        age_category = "Adult"
    else:
        age_category = "Minor"

    print(f"{person['name']}: {age_category}")

total_people = len(people)
total_age = sum(person["age"] for person in people)
average_age = total_age / total_people

print(f"Total people: {total_people}")
print(f"Total age: {total_age}")
print(f"Average age: {average_age}")


def get_adult_names(people):
    return [person["name"] for person in people if person["age"] >= 18]


def get_average_age(people):
    return sum(person["age"] for person in people) / len(people)


adult_names_from_function = get_adult_names(people)
average_age_from_function = get_average_age(people)

print(f"Adult names: {', '.join(adult_names_from_function)}")
print(f"Average age: {average_age_from_function}")


def get_total_people(people):
    return len(people)


def get_age_category(person):
    return "Adult" if person["age"] >= 18 else "Minor"


print("=== People Data Report ===")
print(f"Total people: {get_total_people(people)}")
print(f"Average age: {get_average_age(people)}")
print(f"Adult names: {', '.join(get_adult_names(people))}")

for person in people:
    print(f"{person['name']}: {get_age_category(person)}")

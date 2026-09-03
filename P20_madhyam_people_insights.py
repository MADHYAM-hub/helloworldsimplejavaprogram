people = [
    {"name": "Vikas", "age": 39, "role": "Founder"},
    {"name": "Alice", "age": 5, "role": "AI Co-Pilot"},
    {"name": "Sample Developer", "age": 28, "role": "Developer"},
]

print("MADHYAM People Insights data loaded.")


def get_total_people(people):
    return len(people)


def get_total_age(people):
    return sum(person["age"] for person in people)


def get_average_age(people):
    return get_total_age(people) / get_total_people(people)


def get_adult_names(people):
    return [person["name"] for person in people if person["age"] >= 18]


def get_age_category(person):
    return "Adult" if person["age"] >= 18 else "Minor"


adult_names = ", ".join(get_adult_names(people))
people_report = "\n".join(
    f"{person['name']} — {person['role']} — {get_age_category(person)}"
    for person in people
)

report = f"""=== MADHYAM People Insights ===

Total people: {get_total_people(people)}
Total age: {get_total_age(people)}
Average age: {get_average_age(people)}

Adult names: {adult_names}

People:
{people_report}"""

print(report)

with open("madhyam_people_report.txt", "w", encoding="utf-8") as report_file:
    report_file.write(report)

print("Report saved to madhyam_people_report.txt")

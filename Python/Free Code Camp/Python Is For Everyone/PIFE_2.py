week = ["sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"]


class Time:
    def __init__(self, input):
        # Format is "H:MM AM/PM"
        time_and_ampm = input.split()

        self.hour = time_and_ampm[0].split(':')[0]
        self.minute = time_and_ampm[0].split(':')[1]
        self.ampm = time_and_ampm[1]

    def add_time(self, additional, day=''):
        hour_a = additional.split()[0].split(':')[0]
        minute_a = additional.split()[0].split(':')[1]

        total_minute = int(self.minute) + int(minute_a)
        total_hour = int(self.hour) + int(hour_a) + int(total_minute / 60)

        # Minutes format
        minutes_f = ''
        if total_minute % 60 < 10:
            minutes_f += '0'

        minutes_f += str(total_minute % 60)

        # Hour format
        hour_f = '12' if total_hour % 12 == 0 else str(total_hour % 12)

        days_passed = int(total_hour / 24)

        # AM/PM format
        if self.ampm == 'PM':
            total_hour += 12
            if total_hour >= 24:
                days_passed += 1

        ampm_f = 'AM' if total_hour % 24 < 12 else 'PM'

        # Add N days later
        days_f = ''
        if days_passed >= 1:
            if days_passed == 1:
                days_f += ' (next day)'
            else:
                days_f += ' (' + str(days_passed) + ' days later)'

        current_day_f = ''
        if len(day) > 0:
            current_day_index = week.index(day.lower()) + days_passed
            current_day_index %= 7
            current_day_f += ', ' + week[current_day_index].capitalize()

        time_f = hour_f + ':' + minutes_f + ' ' + ampm_f + current_day_f + days_f
        return time_f


def add_time(start, duration, day=''):
    time = Time(start)
    if len(day) > 0:
        return time.add_time(duration, day)

    return time.add_time(duration)


print(add_time("11:40 AM", "0:25"))

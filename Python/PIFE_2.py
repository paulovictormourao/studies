class Time:
    def __init__(self, input):
        # Format is "H:MM AM/PM"
        time_and_ampm = input.split()

        self.hour = time_and_ampm[0].split(':')[0]
        self.minute = time_and_ampm[0].split(':')[1]
        self.ampm = time_and_ampm[1]

    def add_time(self, additional):
        hour_a = additional.split()[0].split(':')[0]
        minute_a = additional.split()[0].split(':')[1]

        total_minute = int(self.minute) + int(minute_a)
        total_hour = int(self.hour) + int(hour_a) + int(total_minute/60)

        # Minutes format
        if total_minute % 60 == 0:
            minutes_f = '00'
        else:
            minutes_f = str(total_minute % 60)

        # Hour format
        if total_hour % 12 == 0:
            hour_f = '12'
        else:
            hour_f = str(total_hour % 12)

        # AM/PM format
        if total_hour % 24 <= 12:
            ampm_f = 'AM'
        else:
            ampm_f = 'PM'

        # Time format
        time_f = hour_f + ':' + minutes_f + ' ' + ampm_f

        # Add N days later
        days_passed = int(total_hour / 24)

        if self.ampm == 'PM' and total_hour >= 12:
            days_passed += 1

        if days_passed >= 1:
            if days_passed == 1:
                time_f += ' (next day)'
            else:
                time_f += ' (' + str(days_passed) + ' days later)'

        return time_f


def add_time(now, time_to_add):
    test = Time(now)
    return test.add_time(time_to_add)

import random
LOVE_LANGUAGES = ["words", "acts", "gifts", "time", "touch"]


class Partner:
    def __init__(self, language):
        self.language = language

    def response(self, attempt):
        if attempt == self.language:
            return f'{attempt} -> positive'

        return f'{attempt} -> neutral'


partner = Partner(random.choice(LOVE_LANGUAGES))

for i in range(50):
    print(partner.response(input()))

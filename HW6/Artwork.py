# TODO: Import Artist from Artist.py
from Artist import Artist

class Artwork:
    # TODO: Define constructor with parameters to initialize instance attributes
    #       (title, year_created, artist)
    def __init__(self, user_title= "None", year_created=0, user_artist=Artist()):
        self.title = user_title
        self.year_created = year_created
        self.artist = user_artist
    
    def print_info(self):
        self.artist.print_info()
        print('Title: %s, %d' % (self.title, self.year_created))
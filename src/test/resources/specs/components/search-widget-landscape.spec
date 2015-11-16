@objects
    search-widget-landscape     xpath   //div[@class='searchWrapper landscape']
    flights-tab-landscape       xpath   //div[@class='searchWrapper landscape']//ul[contains(@class, 'searchTabs contain')]//a[@data-tab-content-name='qbtb_flights']
    hotels-tab-landscape        xpath   //div[@class='searchWrapper landscape']//ul[contains(@class, 'searchTabs contain')]//a[@data-tab-content-name='qbtb_hotels']
    tours-tab-landscape         xpath   //div[@class='searchWrapper landscape']//ul[contains(@class, 'searchTabs contain')]//a[@data-tab-content-name='qbtb_tours']

= Search widget landscape =
    @on desktop
        search-widget-landscape:
            width ~960px
            height ~282px

    = Tabs =
        @on *
            flights-tab-landscape:
                inside search-widget-landscape ~0px top left
                aligned horizontally all hotels-tab-landscape
                aligned horizontally all tours-tab-landscape

            hotels-tab-landscape:
                right-of flights-tab-landscape ~2px

            tours-tab-landscape:
                right-of hotels-tab-landscape ~2px
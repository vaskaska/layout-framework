@objects
    search-widget-landscape     xpath   //div[@class='searchWrapper landscape']
    flights-tab-landscape       xpath   //div[@class='searchWrapper landscape']//ul[contains(@class, 'searchTabs contain')]//a[@data-tab-content-name='qbtb_flights']
    hotels-tab-landscape        xpath   //div[@class='searchWrapper landscape']//ul[contains(@class, 'searchTabs contain')]//a[@data-tab-content-name='qbtb_hotels']
    tours-tab-landscape         xpath   //div[@class='searchWrapper landscape']//ul[contains(@class, 'searchTabs contain')]//a[@data-tab-content-name='qbtb_tours']

= Search widget landscape =
    = Tabs =
        @on *
            flights-tab-landscape:
                inside search-widget-landscape ~0px top left
            @if ${ "FR" != pos }
                flights-tab-landscape:
                    aligned horizontally all hotels-tab-landscape
                    aligned horizontally all tours-tab-landscape
                hotels-tab-landscape:
                    right-of flights-tab-landscape 1 to 8px
                tours-tab-landscape:
                    right-of hotels-tab-landscape 1 to 8px
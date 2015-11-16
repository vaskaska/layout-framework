@objects
    search-widget-box       xpath   //div[@class='searchWrapper portrait']/div
    flights-tab-box         xpath   //div[@class='searchWrapper portrait']//ul[contains(@class, 'searchTabs contain')]//a[@data-tab-content-name='qbtb_flights']
    hotels-tab-box          xpath   //div[@class='searchWrapper portrait']//ul[contains(@class, 'searchTabs contain')]//a[@data-tab-content-name='qbtb_hotels']
    tours-tab-box           xpath   //div[@class='searchWrapper portrait']//ul[contains(@class, 'searchTabs contain')]//a[@data-tab-content-name='qbtb_tours']

= Search widget box =
    @on desktop
        search-widget-box:
            width ~304px
            height ~410px

    = Tabs =
        @on *
            flights-tab-box:
                inside search-widget-box ~0px top left
                aligned horizontally all hotels-tab-box
                aligned horizontally all tours-tab-box

            hotels-tab-box:
                right-of flights-tab-box ~2px

            tours-tab-box:
                right-of hotels-tab-box ~2px
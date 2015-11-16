@import components/search-widget-box.spec
@import components/search-widget-landscape.spec

= Cheap flights =
    @on *
        search-widget-landscape:
            below search-widget-box
            aligned vertically left search-widget-box

    @on mobile
        search-widget-landscape:
            width 100 % of search-widget-box/width
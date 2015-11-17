@import components/search-widget-landscape.spec

@objects
    body-container          xpath   //div[@class='p-home-page']
    background_picture      xpath   //div[@class='home-sw']
    home-banner             xpath   //div[@class='home-banner']
    sales-item-*            xpath   //div[@class='home-sales-item']
    sales-item-button-*     xpath   //a[@class='home-sales-btn']
    home-usp-header         xpath   //div[@class='home-usp']/h1/div[@class='richtext-default']
    home-usp-logo-*         xpath   //li[@class='home-usp-item']/a/span
    home-usp-text-*         xpath   //li[@class='home-usp-item']//strong
    adventure-header        xpath   //h1[@class='home-title-simple']/div
    adventure-carousel      xpath   //div[@id='home-carousel']
    adventure-small         xpath   //a[@class='home-inspiration-small']
    adventure-large         xpath   //a[@class='home-inspiration-large']
    cross-sell-background   xpath   //div[@class='home-cross-sell-bg']

= Cheap flights page =

    @on desktop
        background_picture:
            width 100% of body-container/width
        search-widget-landscape:
            centered horizontally inside background_picture

        home-banner:
            below background_picture
            centered horizontally inside body-container
        sales-item-1:
            below home-banner
            aligned horizontally all sales-item-2
            aligned horizontally all sales-item-3
            width 100% of sales-item-2/width
            width 100% of sales-item-3/width
            left-of sales-item-2
        sales-item-2:
            left-of sales-item-3
        @for [1-3] as index
            sales-item-button-${index}:
                inside sales-item-${index} 10px left right, ~332px top, 10px bottom

        home-usp-header:
            below sales-item-1
            centered horizontally inside body-container
        home-usp-logo-1:
            below home-usp-header
            aligned horizontally all home-usp-logo-2
            aligned horizontally all home-usp-logo-3
            aligned horizontally all home-usp-logo-4
            width 100% of home-usp-logo-2/width
            width 100% of home-usp-logo-3/width
            width 100% of home-usp-logo-4/width
            left-of home-usp-logo-2
        home-usp-logo-2:
            left-of home-usp-logo-3
        home-usp-logo-3:
            left-of home-usp-logo-4
        @for [1-4] as index
            home-usp-text-${index}:
                below home-usp-logo-${index} 26 to 30px
                aligned vertically centered home-usp-logo-${index} 2px

        adventure-header:
            below home-usp-text-1
            centered horizontally inside body-container
        adventure-carousel:
            below adventure-header
            centered horizontally inside body-container
            width 940px
            height 380px
        adventure-small:
            aligned vertically left adventure-carousel
            below adventure-carousel 0px
            width ~42% of adventure-carousel/width
        adventure-large:
            aligned vertically right adventure-carousel
            below adventure-carousel 0px
            width ~57% of adventure-carousel/width
            aligned horizontally bottom adventure-small

        cross-sell-background:
            color-scheme #f0f0f0
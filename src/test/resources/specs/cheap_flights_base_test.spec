@import components/search-widget-box.spec
@import components/top-flights-deals-widget.spec
@import components/search-widget-landscape.spec

@objects
    body-container              xpath   //div[@class='container']
    adv-carousel                xpath   //div[@class='adw-block-carousel']/..
    adv-right-side              xpath   //div[@class='adw-block-side']
    region-item-*               xpath   //div[contains(@class,'flight-region-row')]/div
    sw-popup-*                  xpath   //div[@class='dealsListPane']/div/div
    load-more-flights-button    xpath   //button[@id='ang']
    contact-us-*                xpath   //ul[@class='contactUs']/a/li
    accordion1-*                xpath   //div[@class='col-lg-3']
    accordion2-*                xpath   //div[@id='accordion2']//div[@class='row']/div
    flight-links-*              xpath   //div[@class='row flightLinks']/div[contains(@class,'col-lg-4')]

= Cheap flights page =

    @on *


    @on desktop
        global:
            count any region-item-* is 6
            count any sw-popup-* is 10
            count any accordion1-* is 4

        search-widget-box:
            width ~31% of body-container/width
            aligned horizontally bottom adv-carousel
            aligned horizontally bottom adv-right-side
        adv-carousel:
            width ~46% of body-container/width
            aligned horizontally top adv-right-side
        adv-right-side:
            width ~20% of body-container/width

        @if ${"DE" == pos}
            search-widget-landscape:
                below adv-right-side
                width ~100% of body-container/width
            region-item-1:
                below search-widget-landscape
        @else
            search-widget-landscape:
                below load-more-flights-button
                width ~100% of body-container/width
            contact-us-1:
                below search-widget-landscape

        region-item-1:
            width ~33% of body-container/width
            % aligned horizontally all region-item-2
            % aligned horizontally all region-item-3
            aligned vertically all region-item-4
        region-item-2:
            width ~33% of body-container/width
            aligned vertically all region-item-5
        region-item-3:
            width ~33% of body-container/width
            aligned vertically all region-item-6
        region-item-4:
            width ~33% of body-container/width
            % aligned horizontally all region-item-5
            % aligned horizontally all region-item-6
        region-item-5:
            width ~33% of body-container/width
        region-item-6:
            width ~33% of body-container/width

        top-flights-deals-widget:
            width ~100% of body-container/width
            below region-item-6

        sw-popup-1:
            below top-flights-deals-widget
        @for [1 - 4, 6 - 9] as index
            sw-popup-${index}:
                width ~45% of body-container/width
                aligned vertically all sw-popup-${index + 1}

        load-more-flights-button:
            below sw-popup-10
            width ~97% of body-container/width

        contact-us-1:
            below load-more-flights-button
        @for [1 - 3] as index
            contact-us-${index}:
                width ~25% of body-container/width
                aligned horizontally all contact-us-${index + 1}
        contact-us-4:
            width ~25% of body-container/width

        accordion1-1:
            below contact-us-4
        @for [1 - 3] as index
            accordion1-${index}:
                width ~25% of body-container/width
                aligned horizontally all accordion1-${index + 1}
        accordion1-4:
            width ~25% of body-container/width

        accordion2-1:
            width ~33% of body-container/width
            aligned horizontally all accordion2-2
            aligned horizontally all accordion2-3
            aligned vertically all accordion2-4
        accordion2-2:
            width ~33% of body-container/width
            aligned vertically all accordion2-5
        accordion2-3:
            width ~33% of body-container/width
            aligned vertically all accordion2-6
        accordion2-4:
            width ~33% of body-container/width
            aligned horizontally all accordion2-5
            aligned horizontally all accordion2-6
        accordion2-5:
            width ~33% of body-container/width
        accordion2-6:
            width ~33% of body-container/width

        flight-links-1:
            below accordion2-6
            width ~33% of body-container/width
            aligned horizontally top flight-links-2
            aligned horizontally top flight-links-3
        flight-links-2:
            width ~33% of body-container/width
        flight-links-3:
            width ~33% of body-container/width

    @on mobile

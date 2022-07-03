package com.voxeldev.summerpractice2022.data.models

class CosmeticsRepository {

    fun getSnacks(): List<Cosmetics> {

        return listOf(
            Cosmetics(
                0,
                "Cream",
                "Тональный крем",
                "1200 руб.",
                "https://beauty.ua/uploads/photos/45/373618111_w0_h0_hdf01_main.jpg"
            ),
            Cosmetics(
                1,
                "Mascara",
                "Тушь для ресниц",
                "800 руб.",
                "https://irecommend.ru/sites/default/files/product-images/1452852/37NRL8yYX0BnLtqNjsvLA.jpeg"
            ),
            Cosmetics(
                2,
                "Eyeliner",
                "Подводка для глаз",
                "600 руб.",
                "https://www.letu.ru/common/img/uploaded/skuImageFolder/LT0117701GT.jpg"
            ),
            Cosmetics(
                3,
                "Powder",
                "Пудра",
                "1200 руб.",
                "https://ru.eveline.eu/file/image/w768/h768/9160i0ad9c8d77241256ad2d.jpg"
            ),
            Cosmetics(
                2,
                "Pomade",
                "Помада",
                "800 руб.",
                "https://m.mac-cosmetics.ru/media/export/cms/products/640x600/mac_sku_M2LPP9_640x600_0.jpg"
            ),
            Cosmetics(
                2,
                "Eye shadow",
                "Тени для глаз",
                "130 руб.",
                "https://visagehall.ru/api/site/products/134736/image"
            )
        )
    }
}
package com.example.myrecyclerview.model;

import com.example.myrecyclerview.R;

import java.util.ArrayList;

public class PlacesData {
    private static String[] placesName = {
            "Tunjungan Plaza",
            "Pakuwon Mall",
            "Ciputra World",
            "Kenjeran Beach",
            "Bungkul Park",
            "Surabaya Zoo",
            "Surabaya Carnival",
            "Galaxy Mall",
            "House of Sampoerna",
            "Suramadu Bridge"
    };

    private static String[] placesDetail = {
            "Tunjungan Plaza is the second-biggest shopping center in Surabaya after Pakuwon Mall. It has a net leaseable area of 160,000 m², which houses more than 500 retail outlets including boutiques, restaurants, cafes, cinemas, bookstores, supermarkets, and children's arcade center. ",
            "Pakuwon Mall (formerly Supermal Pakuwon Indah, abbreviated SPI) is the biggest mall in Surabaya, Indonesia. The mall has leaseable area of 180,000 m2. This mall is connected with Pakuwon Trade Center (PTC). It is on Jalan Puncak Indah Lontar at Pakuwon Indah Superblock complex at 30-hectare land area, at the CBD of West Surabaya. At the top of Pakuwon Mall, there are four tower apartments, which are called Orchard and Tanglin Tower, Anderson and Benson Tower which currently still under construction, and there are two condominium towers called La Riz and La Viz. La Viz is still under construction. ",
            "Ciputra World Surabaya is a mixed development complex in Surabaya, Indonesia. The superblock is developed by PT. Ciputra Development Tbk., which has a land area of about 9 hectares. This super-block has 4 residential towers named The Via, The Vue, The Viola, and Sky Loft. Another residential tower, Vie Loft, and an office tower are under-construction.",
            "Kenjeran beach is located in Kenjeran district in the east top Surabaya, which is ± 9 km from Surabaya. Kenjeran beach has divided into two beaches; they are Old Kenjeran Beach and New Kenjeran Beach.",
            "Bungkul Park is one of open green area and pledge culture artifact. The existence of Bungkul Park that encircled by trees and green grass bring big benefits to reduce air pollution and also as social environment in vicinity.",
            "Surabaya Zoo was established by decree of the Governor General of the Netherlands East Indies on 31 August 1916 as Soerabaiasche Planten-en Dierentuin on the merit of the journalist H. F. K. Kommer who had the hobby of collecting animals.",
            "Suroboyo Carnival merupakan destinasi wisata yang memiliki wahana rekreasi yang begitu lengkap dan dapat dimainkan oleh semua umur. Suroboyo Carnival memiliki berbagai keunikan diantaranya yaitu buka pada malam hari dan merupakan tempat wisata terbesar di Kota Surabaya.",
            "Galaxy Mall (former called Mal Galaxy) built in 1994. Two years later, the construction was completed and opened. At the time, the shopping center was managed by PT. Galaxy Beam. The main tenants at that time were Hero Supermarket, Timezone, Keris Department Stores, McDonald's and Galaxy 21. Galaxy Mall also has Techno Zone (computer and handphone center) to date, on the 2nd floor, the food court of the archipelago and internationally (now Food Galaxy) in 3rd floor.",
            "The House of Sampoerna is a tobacco museum and headquarters of Sampoerna located in Surabaya. The main building's architectural style influenced by Dutch colonial-style compound was built in 1862, and is now a preserved historical site. Previously used as an orphanage managed by the Dutch‚ it was purchased in 1932, by Liem Seeng Tee‚ the founder of Sampoerna‚ with the intent of it being used as Sampoerna’s first major cigarette production facility. ",
            "he Suramadu Bridge (Indonesian: Jembatan Suramadu), also known as the Surabaya–Madura Bridge, is a cable-stayed bridge between Surabaya on the island of Java and the town of Bangkalan on the island of Madura in Indonesia.[4] Opened in June 2009,[5] the 5.4-km bridge is the longest in Indonesia and the first bridge to cross the Madura Strait."
    };

    private static int[] placesPhoto = {
            R.drawable.tunjungan_plaza,
            R.drawable.pakuwon_mall,
            R.drawable.ciputra_world,
            R.drawable.pantai_kenjeran,
            R.drawable.taman_bungkul,
            R.drawable.kebun_binatang,
            R.drawable.surabaya_carnival_park,
            R.drawable.galaxy_mall,
            R.drawable.house_of_sampoerna,
            R.drawable.suramadu_bridge
    };

//    public static ArrayList<Place> getListData() {
//        ArrayList<Place> list = new ArrayList<>();
//        for (int i = 0; i < placesName.length; i++) {
//            Place place = new Place();
//            place.setName(placesName[i]);
//            place.setDetail(placesDetail[i]);
//            place.setPhoto(placesPhoto[i]);
//            list.add(place);
//        }
//        return list;
//    }
//
//    public Place getData(int id) {
//        Place place = new Place();
//        place.setName(placesName[id]);
//        place.setDetail(placesDetail[id]);
//        place.setPhoto(placesPhoto[id]);
//        return place;
//    }
}

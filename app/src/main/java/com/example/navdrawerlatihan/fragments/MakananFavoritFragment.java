package com.example.navdrawerlatihan.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.navdrawerlatihan.Informasi;
import com.example.navdrawerlatihan.ItemInformasi;
import com.example.navdrawerlatihan.R;

public class MakananFavoritFragment extends Fragment {
    CardView ramenView, ayamPop, supIga;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_makanan_favorit, container, false);

        ramenView = view.findViewById(R.id.ramen);
        ayamPop = view.findViewById(R.id.ayam_pop);
        supIga = view.findViewById(R.id.sup_iga);

        ItemInformasi ramenInfo = new ItemInformasi("Ramen",
                        "Ramen adalah hidangan mi populer yang berasal dari Jepang, yang telah menyebar ke seluruh dunia dan menjadi favorit di berbagai belahan dunia. Hidangan ini terdiri dari mi gandum yang panjang dan kenyal, disajikan dalam kuah yang biasanya terbuat dari kaldu tulang babi atau ayam yang kaya rasa, dicampur dengan berbagai bumbu seperti kecap asin, miso, atau shoyu. Ramen juga sering dihidangkan dengan beragam tambahan, seperti potongan daging babi panggang (chashu), telur rebus, rumput laut (nori), jamur, sayuran, dan bahkan nori. Yang membedakan Ramen dari mi lainnya adalah tekstur mi yang kenyal dan kuah yang kaya rasa, serta fleksibilitasnya dalam variasi rasa dan tambahan bahan. ",
                R.drawable.ramen);

        ItemInformasi ayamInfo = new ItemInformasi("Ayam Pop",
                "Ayam Pop adalah hidangan khas dari Sumatera Barat, Indonesia, yang dikenal dengan cita rasa yang khas dan lezat. Hidangan ini terdiri dari potongan ayam yang diolah dengan rempah-rempah tradisional, seperti jahe, daun salam, serai, dan bawang putih, yang memberikan aroma harum yang menggugah selera. Proses memasaknya, yang umumnya dengan cara dipanggang atau direbus, menghasilkan daging ayam yang empuk dengan kulit yang renyah. Ayam Pop biasanya disajikan dengan sambal atau saus pedas sebagai pelengkapnya. Hidangan ini merupakan bagian tak terpisahkan dari warisan kuliner Sumatera Barat dan sering dinikmati dalam acara keluarga atau perayaan khusus, menjadi bukti kekayaan kuliner Indonesia.",
                R.drawable.ayam_pop);

        ItemInformasi supInfo = new ItemInformasi("Sup Iga",
                "Sup iga adalah hidangan yang terdiri dari potongan iga sapi yang dimasak dalam kuah yang kaya rasa, biasanya dengan tambahan berbagai rempah dan bahan lainnya. Iga sapi yang digunakan umumnya dipilih dari bagian dada atau rusuk, yang memberikan rasa dan tekstur yang lembut serta empuk setelah dimasak dalam waktu yang cukup lama. Kuahnya biasanya terbuat dari kaldu sapi yang kaya, dicampur dengan bawang putih, bawang bombay, wortel, kentang, seledri, dan bumbu-bumbu lainnya seperti lada hitam, merica, garam, dan gula. Proses memasaknya yang lambat dan teliti memastikan bahwa rasa dan aroma rempah meresap dalam daging iga, menciptakan hidangan yang lezat dan memanjakan lidah.",
                R.drawable.sup_iga);

        ramenView.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Informasi.class);
            intent.putExtra("nama", ramenInfo.getNama());
            intent.putExtra("informasi", ramenInfo.getInformasi());
            intent.putExtra("image", ramenInfo.getImage());
            intent.putExtra("fragment", "makananFavorit");
            startActivity(intent);
        });

        ayamPop.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Informasi.class);
            intent.putExtra("nama", ayamInfo.getNama());
            intent.putExtra("informasi", ayamInfo.getInformasi());
            intent.putExtra("image", ayamInfo.getImage());
            intent.putExtra("fragment", "makananFavorit");
            startActivity(intent);
        });

        supIga.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Informasi.class);
            intent.putExtra("nama", supInfo.getNama());
            intent.putExtra("informasi", supInfo.getInformasi());
            intent.putExtra("image", supInfo.getImage());
            intent.putExtra("fragment", "makananFavorit");
            startActivity(intent);
        });

        return view;
    }
}
package com.example.navdrawerlatihan.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.navdrawerlatihan.Informasi;
import com.example.navdrawerlatihan.ItemInformasi;
import com.example.navdrawerlatihan.MainActivity;
import com.example.navdrawerlatihan.R;

public class MakananKhasFragment extends Fragment {
    CardView rendang, sate, dendeng, ayam, nasi;
    private Intent intent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_makanan_khas, container, false);

        rendang = view.findViewById(R.id.rendang);
        sate = view.findViewById(R.id.satepadang);
        dendeng = view.findViewById(R.id.dendengbalado);
        ayam = view.findViewById(R.id.ayampop);
        nasi = view.findViewById(R.id.nasipadang);

        ItemInformasi rendangInfo = new ItemInformasi("Rendang",
                "Rendang adalah hidangan khas Indonesia yang terkenal dengan rasa kaya rempah dan daging yang empuk. Asalnya berasal dari Minangkabau, Sumatera Barat, dan telah menjadi salah satu ikon kuliner Indonesia yang populer secara internasional. Proses memasak rendang melibatkan memasak daging sapi dalam campuran rempah-rempah, seperti serai, lengkuas, jahe, bawang merah, bawang putih, cabai, dan santan kelapa, hingga menjadi kering dan berwarna kecokelatan. Rendang tidak hanya sekadar makanan lezat, tetapi juga mencerminkan kekayaan budaya dan tradisi kuliner Indonesia.",
                R.drawable.rendang);

        ItemInformasi sateInfo = new ItemInformasi("Sate Padang",
                "Sate Padang adalah hidangan yang berasal dari kota Padang, Sumatera Barat, Indonesia, yang terkenal dengan cita rasanya yang khas dan cita rasa yang lezat. Sate ini terdiri dari potongan daging sapi, biasanya menggunakan daging sapi muda yang dipotong kecil-kecil dan ditusuk dengan bambu, lalu dipanggang dengan arang. Yang membedakan Sate Padang dari sate lainnya adalah bumbu kacangnya yang kaya rempah, biasanya terbuat dari campuran kacang tanah, bawang merah, bawang putih, cabai, serai, dan berbagai rempah lainnya, yang memberikan cita rasa yang kaya dan menggugah selera.",
                R.drawable.sate_padang);

        ItemInformasi dendengInfo = new ItemInformasi("Dendeng Balado",
                "Dendeng Balado adalah hidangan khas Indonesia yang terkenal dengan kombinasi cita rasa pedas, manis, dan gurih yang menggugah selera. Dendeng Balado berasal dari Minangkabau, Sumatera Barat, dan telah menjadi salah satu favorit dalam masakan Indonesia. Hidangan ini terbuat dari daging sapi yang dipotong tipis, kemudian digoreng kering hingga menjadi renyah. Kemudian, dendeng tersebut disajikan dengan balado, sebuah saus pedas khas Indonesia yang terbuat dari cabai merah, bawang merah, bawang putih, tomat, dan berbagai rempah-rempah lainnya.",
                R.drawable.dendeng_balado);

        ItemInformasi ayamInfo = new ItemInformasi("Ayam Pop",
                "Ayam Pop adalah hidangan khas dari Sumatera Barat, Indonesia, yang dikenal dengan cita rasa yang khas dan lezat. Hidangan ini terdiri dari potongan ayam yang diolah dengan rempah-rempah tradisional, seperti jahe, daun salam, serai, dan bawang putih, yang memberikan aroma harum yang menggugah selera. Proses memasaknya, yang umumnya dengan cara dipanggang atau direbus, menghasilkan daging ayam yang empuk dengan kulit yang renyah. Ayam Pop biasanya disajikan dengan sambal atau saus pedas sebagai pelengkapnya. Hidangan ini merupakan bagian tak terpisahkan dari warisan kuliner Sumatera Barat dan sering dinikmati dalam acara keluarga atau perayaan khusus, menjadi bukti kekayaan kuliner Indonesia.",
                R.drawable.ayam_pop);

        ItemInformasi nasiInfo = new ItemInformasi("Nasi Padang",
                        "Nasi Padang adalah hidangan khas Indonesia yang berasal dari daerah Padang, Sumatera Barat. Hidangan ini terdiri dari nasi putih yang disajikan dengan berbagai macam lauk pauk khas Minangkabau. Lauk pauk tersebut meliputi berbagai hidangan seperti rendang daging sapi, ayam goreng, gulai ayam, gulai otak, gulai kikil, ikan balado, telur balado, sambal lado mudo, sambal hijau, dan aneka sayuran seperti daun singkong atau daun ubi. Salah satu ciri khas yang melekat pada hidangan Nasi Padang adalah pilihan bumbu rempah yang kaya dan kuah yang gurih, yang membuatnya memiliki cita rasa yang unik dan menggugah selera.",
                R.drawable.nasi_padang
                );

        rendang.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Informasi.class);
            intent.putExtra("nama", rendangInfo.getNama());
            intent.putExtra("informasi", rendangInfo.getInformasi());
            intent.putExtra("image", rendangInfo.getImage());
            startActivity(intent);
        });

        sate.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Informasi.class);
            intent.putExtra("nama", sateInfo.getNama());
            intent.putExtra("informasi", sateInfo.getInformasi());
            intent.putExtra("image", sateInfo.getImage());
            startActivity(intent);
        });

        dendeng.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Informasi.class);
            intent.putExtra("nama", dendengInfo.getNama());
            intent.putExtra("informasi", dendengInfo.getInformasi());
            intent.putExtra("image", dendengInfo.getImage());
            startActivity(intent);
        });

        ayam.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Informasi.class);
            intent.putExtra("nama", ayamInfo.getNama());
            intent.putExtra("informasi", ayamInfo.getInformasi());
            intent.putExtra("image", ayamInfo.getImage());
            startActivity(intent);
        });

        nasi.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Informasi.class);
            intent.putExtra("nama", nasiInfo.getNama());
            intent.putExtra("informasi", nasiInfo.getInformasi());
            intent.putExtra("image", nasiInfo.getImage());
            startActivity(intent);
        });

        return view;
    }
}
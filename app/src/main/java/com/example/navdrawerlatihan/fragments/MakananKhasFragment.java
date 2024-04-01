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

        rendang.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Informasi.class);
            intent.putExtra("nama", rendangInfo.getNama());
            intent.putExtra("informasi", rendangInfo.getInformasi());
            intent.putExtra("image", rendangInfo.getImage());
            startActivity(intent);
        });



        return view;
    }
}
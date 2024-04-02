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

public class MinumanKhasFragment extends Fragment {
    CardView tehTalua, ampiangDadiah;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_minuman_khas, container, false);

        tehTalua = view.findViewById(R.id.teh_talua);
        ampiangDadiah = view.findViewById(R.id.ampiang_dadiah);

        ItemInformasi tehInfo = new ItemInformasi("Teh Talua",
                        "Teh Talua adalah minuman tradisional yang berasal dari daerah Pegunungan Minangkabau, Sumatera Barat, Indonesia. Minuman ini terkenal dengan kombinasi yang unik antara teh, telur, dan gula merah yang menghasilkan cita rasa yang khas dan menyegarkan. Proses pembuatannya dimulai dengan merebus teh dengan gula merah hingga gula larut sepenuhnya. Selanjutnya, telur ayam kampung dikocok dan dituangkan ke dalam teh panas tersebut sambil diaduk hingga merata. Tekstur dan kekentalan minuman ini bervariasi tergantung pada banyaknya telur yang digunakan.",
                R.drawable.teh_talua);

        ItemInformasi ampiangInfo = new ItemInformasi("Ampiang Dadiah",
                "Ampiang Dadiah merupakan makanan ringan tradisional yang berasal dari daerah Minangkabau, Sumatera Barat, Indonesia. Hidangan ini terbuat dari campuran dadiah, yaitu yogurt tradisional yang dibuat dari susu kerbau atau kambing, dengan tambahan gula merah yang telah diolah menjadi sirup. Ampiang Dadiah biasanya disajikan dalam wadah bambu kecil yang berisi dadiah yang telah dituangkan sirup gula merah di atasnya. Hidangan ini menawarkan kombinasi rasa yang unik antara keasaman dadiah dan manisnya sirup gula merah yang khas.",
                R.drawable.ampiang_dadiah);

        tehTalua.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Informasi.class);
            intent.putExtra("nama", tehInfo.getNama());
            intent.putExtra("informasi", tehInfo.getInformasi());
            intent.putExtra("image", tehInfo.getImage());
            startActivity(intent);
        });

        ampiangDadiah.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Informasi.class);
            intent.putExtra("nama", ampiangInfo.getNama());
            intent.putExtra("informasi", ampiangInfo.getInformasi());
            intent.putExtra("image", ampiangInfo.getImage());
            startActivity(intent);
        });

        return view;
    }
}
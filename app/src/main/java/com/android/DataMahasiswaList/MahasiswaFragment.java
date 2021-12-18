package com.android.DataMahasiswaList;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MahasiswaFragment extends Fragment {
    public ArrayList<MahasiswaModel> list = new ArrayList<>();
    public static Map<String, ArrayList<MahasiswaModel>> bigList = new HashMap<String, ArrayList<MahasiswaModel>>();
    ArrayList<String> data_mhs = new ArrayList<String>();
    View view;
    ListView lv;
    ArrayAdapter<String> adapter;

    private static final String ARG_PARAM1 = "2018";

    public String mParam1;

    public MahasiswaFragment() {
        // Required empty public constructor
    }

    public static MahasiswaFragment newInstance(String param1) {
        MahasiswaFragment fragment = new MahasiswaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            System.out.println(mParam1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_main, container, false);

        lv = (ListView) view.findViewById(R.id.listView);

        getData();

        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data_mhs);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int id, long l) {
                Intent sendData = new Intent(getActivity(), DetailActivity.class);

                sendData.putExtra("nama", list.get(id).getNama());
                sendData.putExtra("nim", list.get(id).getNim());
                sendData.putExtra("email", list.get(id).getEmail());
                sendData.putExtra("fklts", list.get(id).getFakultas());
                sendData.putExtra("prodi", list.get(id).getProdi());
                sendData.putExtra("smstr", list.get(id).getSemesterTerdaftar());
                sendData.putExtra("stat", list.get(id).getStatus());
                sendData.putExtra("foto", list.get(id).getFoto());

                startActivity(sendData);
            }
        });

        return view;
    }

    private Map<String, ArrayList<MahasiswaModel>> buildMahasiswaData() {
        ArrayList<MahasiswaModel> data2017 = new ArrayList<>();
        data2017.add(new MahasiswaModel("Aflah Mutsanni Pulungan", "171402012","aflahmutsanni01@yahoo.com","https://portal.usu.ac.id/photos/171402012"));
        data2017.add(new MahasiswaModel("Muhammad Reza", "171402017","rezaslow18@gmail.com","https://portal.usu.ac.id/photos/171402017"));
        data2017.add(new MahasiswaModel("Farhan Abdillah", "171402018","abdillahfarhan357@gmail.com","https://portal.usu.ac.id/photos/171402018"));
        data2017.add(new MahasiswaModel("Nadia Nasywa Lubis", "171402001","nadianasywa25@gmail.com","https://portal.usu.ac.id/photos/171402001"));
        data2017.add(new MahasiswaModel("Grace Sella Br. Ginting", "171402002","gracesella63@gmail.com","https://portal.usu.ac.id/photos/171402002"));
        data2017.add(new MahasiswaModel("Nabila Sagita", "171402005","n.sagita47@gmail.com","https://portal.usu.ac.id/photos/171402005"));
        data2017.add(new MahasiswaModel("Fifi Angreni Br. Gtg", "171402003","fifiangreni30@gmail.com","https://portal.usu.ac.id/photos/171402003"));
        data2017.add(new MahasiswaModel("Jackie Chandra", "171402004","jackiechandra70@gmail.com","https://portal.usu.ac.id/photos/171402004"));
        data2017.add(new MahasiswaModel("Lisa Ayuning Tias", "171402008","tiassyu945@gmail.com","https://portal.usu.ac.id/photos/171402008"));
        data2017.add(new MahasiswaModel("Miftah Aulia", "171402009","miftahaulia77@gmail.com","https://portal.usu.ac.id/photos/171402009"));
        bigList.put("2017", data2017);
        ArrayList<MahasiswaModel> data2018 = new ArrayList<>();
        data2018.add(new MahasiswaModel("Fadel Majid Muhammad", "181402030","majidray23@gmail.com","https://portal.usu.ac.id/photos/181402030"));
        data2018.add(new MahasiswaModel("Arya Ahmad Diansyah", "181402045","diansyaharya3@gmail.com","https://portal.usu.ac.id/photos/181402045"));
        data2018.add(new MahasiswaModel("Hafizh Rafi Muhammad", "181402069","hafizhrafi28@gmail.com","https://portal.usu.ac.id/photos/181402069"));
        data2018.add(new MahasiswaModel("Nabilah Luthfiyah Nasution", "181402039","nabilahluthfiyah27@gmail.com","https://portal.usu.ac.id/photos/181402039"));
        data2018.add(new MahasiswaModel("Amira Nurul Amanda", "181402009","amiraamandanurul@gmail.com","https://portal.usu.ac.id/photos/181402009"));
        data2018.add(new MahasiswaModel("Nurhaliza Syahfitri", "181402006","nurhalizasyaf@gmail.com","https://portal.usu.ac.id/photos/181402006"));
        data2018.add(new MahasiswaModel("Ammar Rafi Afandi Hasibuan", "181402003","ammar.rafi619@gmail.com","https://portal.usu.ac.id/photos/181402003"));
        data2018.add(new MahasiswaModel("Muhammad Arib Naufal Marpaung", "181402004","arib.naufal12@gmail.com","https://portal.usu.ac.id/photos/181402004"));
        data2018.add(new MahasiswaModel("Farhan Al Zuhri Nasution", "181402005","farhan.alzuhri@gmail.com","https://portal.usu.ac.id/photos/181402005"));
        data2018.add(new MahasiswaModel("Dimas Nugraha", "181402105","dimasnugraha2510@gmail.com","https://portal.usu.ac.id/photos/181402105"));
        bigList.put("2018", data2018);
        ArrayList<MahasiswaModel> data2019 = new ArrayList<>();
        data2019.add(new MahasiswaModel("Geylfedra Matthew Panggabaen", "191402065","geylrillas@gmail.com","https://portal.usu.ac.id/photos/191402065   "));
        data2019.add(new MahasiswaModel("Utari Anggita", "191402002","UTARIANGGITA6151@GMAIL.COM","https://portal.usu.ac.id/photos/191402002"));
        data2019.add(new MahasiswaModel("Denaya Pramudya", "191402003","denayapramudya55@gmail.com","https://portal.usu.ac.id/photos/191402003"));
        data2019.add(new MahasiswaModel("Cici Desi M.", "191402004","cicihutapea09@gmail.com ","https://portal.usu.ac.id/photos/191402004"));
        data2019.add(new MahasiswaModel("Milpa Wahyuni Siregar", "191402005","milpawahyuni771@gmail.com","https://portal.usu.ac.id/photos/191402005"));
        data2019.add(new MahasiswaModel("Jogiana Simangunsong", "191402006","jogiana11@gmail.com","https://portal.usu.ac.id/photos/191402006"));
        data2019.add(new MahasiswaModel("Zen Petriz Diaz", "191402007","zenpetrix@gmail.com","https://portal.usu.ac.id/photos/191402007"));
        data2019.add(new MahasiswaModel("Dinda Julia Putri", "191402008","dindajuliap30@gmail.com","https://portal.usu.ac.id/photos/191402008"));
        data2019.add(new MahasiswaModel("Okta Gilang", "191402009","Aljaffarsyah10@gmail.com","https://portal.usu.ac.id/photos/191402009"));
        data2019.add(new MahasiswaModel("Nurul Atiqah Siregar", "191402010","nurulattikasiregar@yahoo.com","https://portal.usu.ac.id/photos/191402010"));
        bigList.put("2019", data2019);

        return bigList;
    }

    private void getData(){
        Map<String, ArrayList<MahasiswaModel>> data = buildMahasiswaData();

        list = data.get(mParam1);

        for (int i = 0; i < list.size(); i++) {
            data_mhs.add(list.get(i).getNama());
        }
    }
}

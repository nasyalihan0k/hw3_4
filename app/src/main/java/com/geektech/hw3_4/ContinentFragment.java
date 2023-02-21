package com.geektech.hw3_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.geektech.hw3_4.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements com.example.hw3_4.OnClick {

    private FragmentContinentBinding binding;

    private ArrayList<String> continentList;
    private ContinentAdapter continentAdapter;
    private Integer posit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        loadData();
        continentAdapter = new ContinentAdapter(continentList, this);
        binding.rvContinents.setAdapter(continentAdapter);
    }

    private void loadData() {
        continentList = new ArrayList<>();
        continentList.add("Asia");
        continentList.add("Africa");
        continentList.add("Americas");
        continentList.add("Europa");
    }

    @Override
    public void onClick(int post) {
        Bundle bundle = new Bundle();
        bundle.putInt("POSIT", post);
        CountryFragment fragment = new CountryFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.container, fragment).addToBackStack(null).commit();

    }
}
package com.geektech.hw3_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.geektech.hw3_4.databinding.FragmentCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;

    private ArrayList<com.example.hw3_4.Country> countryList = new ArrayList<com.example.hw3_4.Country>();

    private CountryAdapter countryAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int post = getArguments().getInt("POSIT");

        ChekPost(post);

        countryAdapter = new CountryAdapter(countryList);
        binding.rvCountry.setAdapter(countryAdapter);

    }




    private void ChekPost(int post) {
        if (post == 0) {
            loadAsia();
        }
        if (post == 1) {
            loadAfrica();
        }
        if (post == 2) {
            loadAmericas();
        }
        if (post == 3) {
            loadEuropa();
        }
    }

    private void loadAsia() {
        countryList.add(new com.example.hw3_4.Country("Kyrgyz Republic", "Bishkek", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Kyrgyzstan.png/1200px-Flag_of_Kyrgyzstan.png"));
        countryList.add(new com.example.hw3_4.Country("Kazakhstan", "Astana", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/1000px-Flag_of_Kazakhstan.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Uzbekistan", "Tashkent", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Flag_of_Uzbekistan.png/1200px-Flag_of_Uzbekistan.png"));
        countryList.add(new com.example.hw3_4.Country("Japan", "Tokyo", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/2560px-Flag_of_Japan.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Korea", "Seoul", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Flag_of_South_Korea.png/640px-Flag_of_South_Korea.png"));
        countryList.add(new com.example.hw3_4.Country("Qatar", "Doha", "https://upload.wikimedia.org/wikipedia/commons/6/61/Flag_of_Qatar.png"));
        countryList.add(new com.example.hw3_4.Country("UAE", "Abu-Dhabi", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cb/Flag_of_the_United_Arab_Emirates.svg/2560px-Flag_of_the_United_Arab_Emirates.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Iraq", "Baghdad", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Flag_of_Iraq.svg/2560px-Flag_of_Iraq.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Chine", "Beijing", "https://upload.wikimedia.org/wikipedia/commons/2/2e/Flag_of_China.png"));
        countryList.add(new com.example.hw3_4.Country("India", "New Deli", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_India.png/2560px-Flag_of_India.png"));
    }

    private void loadEuropa() {
        countryList.add(new com.example.hw3_4.Country("Germany", "Berlin", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Germany.svg/2560px-Flag_of_Germany.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Francia", "Paris", "https://upload.wikimedia.org/wikipedia/commons/6/62/Flag_of_France.png"));
        countryList.add(new com.example.hw3_4.Country("Ukraine", "Kiev", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Flag_of_Ukraine.png/640px-Flag_of_Ukraine.png"));
        countryList.add(new com.example.hw3_4.Country("Belgium", "Brussels", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Flag_of_Belgium.svg/2363px-Flag_of_Belgium.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Spanish", "Madrid", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Spain.svg/2560px-Flag_of_Spain.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Italy", "Rom", "https://upload.wikimedia.org/wikipedia/commons/e/e4/Flag_of_Italy_%281946%E2%80%932003%29.png"));
        countryList.add(new com.example.hw3_4.Country("Turkey", "Ankara", "https://upload.wikimedia.org/wikipedia/commons/8/87/Flag_of_Turkey.png"));
        countryList.add(new com.example.hw3_4.Country("United Kingdom", "London", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Flag_of_the_United_Kingdom.png/1200px-Flag_of_the_United_Kingdom.png"));
        countryList.add(new com.example.hw3_4.Country("Netherlands", "Amsterdam", "https://upload.wikimedia.org/wikipedia/commons/b/b2/Flag_of_the_Netherlands.png"));
        countryList.add(new com.example.hw3_4.Country("Belarus", "Minsk", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Flag_of_Belarus.svg/2560px-Flag_of_Belarus.svg.png"));
    }

    private void loadAmericas() {
        countryList.add(new com.example.hw3_4.Country("USA", "Washington", "https://upload.wikimedia.org/wikipedia/commons/d/de/Flag_of_the_United_States.png"));
        countryList.add(new com.example.hw3_4.Country("Argentina", "Buenos Aires", "https://upload.wikimedia.org/wikipedia/commons/f/f2/Argentina_Flag.png"));
        countryList.add(new com.example.hw3_4.Country("Chili", "Santiago", "https://upload.wikimedia.org/wikipedia/commons/a/ae/Flag_of_Chile.png"));
        countryList.add(new com.example.hw3_4.Country("Mexico", "Mexico", "https://upload.wikimedia.org/wikipedia/commons/1/17/Flag_of_Mexico.png"));
        countryList.add(new com.example.hw3_4.Country("Canada", "Ottawa", "https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Canada.png"));
        countryList.add(new com.example.hw3_4.Country("Venezuela", "Caracas", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/1280px-Flag_of_Venezuela.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Columbia", "Bogota", "https://upload.wikimedia.org/wikipedia/commons/f/f8/Flag_of_Colombia.png"));
        countryList.add(new com.example.hw3_4.Country("Brazil", "Brasilia", "https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/2560px-Flag_of_Brazil.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Honduras", "Tegucigalpa", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Flag_of_Honduras_%281949%E2%80%932022%29.svg/1280px-Flag_of_Honduras_%281949%E2%80%932022%29.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Peru", "Lima", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/1280px-Flag_of_Peru_%28state%29.svg.png"));
    }

    private void loadAfrica() {
        countryList.add(new com.example.hw3_4.Country("Egypt", "Cairo", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Flag_of_Egypt_%28variant%29.png/1200px-Flag_of_Egypt_%28variant%29.png"));
        countryList.add(new com.example.hw3_4.Country("Ethiopia", "Addis Ababa", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Flag_of_Ethiopia.svg/800px-Flag_of_Ethiopia.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Nigeria", "Abuja", "https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Nigeria.png"));
        countryList.add(new com.example.hw3_4.Country("Morocco", "Rabat ", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/2560px-Flag_of_Morocco.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Madagascar", "Antananarivo ", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Madagascar.svg/2560px-Flag_of_Madagascar.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Senegal", "Dakar ", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Flag_of_Senegal.svg/1280px-Flag_of_Senegal.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Tunisia", "Tunis ", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Flag_of_Tunisia.png/1024px-Flag_of_Tunisia.png"));
        countryList.add(new com.example.hw3_4.Country("Libya", "Tripoli ", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Libya.svg/2560px-Flag_of_Libya.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Uganda", "Kampala ", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Flag_of_Uganda.svg/1280px-Flag_of_Uganda.svg.png"));
        countryList.add(new com.example.hw3_4.Country("Kenya", "Nairobi", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Kenya.svg/1024px-Flag_of_Kenya.svg.png"));
    }
}
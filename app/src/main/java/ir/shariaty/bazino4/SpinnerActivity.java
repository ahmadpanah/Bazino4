package ir.shariaty.bazino4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ir.shariaty.bazino4.databinding.ActivitySpinnerBinding;

public class SpinnerActivity extends AppCompatActivity {

    ActivitySpinnerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySpinnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
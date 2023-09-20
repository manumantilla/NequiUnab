package AdrianParra.nequiunab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();
    private RecyclerView rvListAcount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();
        rvListAcount = findViewById(R.id.rv_account);

        AccountAdapter myAdapter = new AccountAdapter(listAccountRV);
        rvListAcount.setAdapter(myAdapter);

        rvListAcount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));
    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Restaurante", " Nombre:", 250000.0,"https://i.pinimg.com/originals/cb/0a/41/cb0a415465fcee4abb64ec1e0403a377.png");
        Account myAccount2 = new Account("Gasolina", "Nombre:", 200000.0,"https://domiciliocolombia.co/wp-content/uploads/2022/05/davivienda-domicilio-colombia-e1651623270162.png");
        Account myAccount3 = new Account("Arriendo", "Nombre:", 150000.0,"https://i.pinimg.com/474x/b8/cd/c1/b8cdc1ad498fe080bc21bb5a03c24f83.jpg");
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }
}
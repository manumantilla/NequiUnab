package AdrianParra.nequiunab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder>{
    private ArrayList<Account> dataSet;

    public AccountAdapter(ArrayList<Account>dataSet){
        this.dataSet=dataSet;
    }
    @NonNull
    @Override
    public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rv_account_list,parent,false);

        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account myAccount = dataSet.get(position);
        holder.loadItem(myAccount);

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvName, tvCurrentValue, tvType;
        private ImageView ivPrincipal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.nombrecuenta);
            tvCurrentValue = itemView.findViewById(R.id.textosaldo);
            tvType = itemView.findViewById(R.id.textotipo);
        }

        public void loadItem(Account myAccount) {
            tvName.setText(myAccount.getName());
            tvCurrentValue.setText(String.valueOf(myAccount.getCurrentValue()));
            tvType.setText(myAccount.getTypeAccount());
        }
    }
}

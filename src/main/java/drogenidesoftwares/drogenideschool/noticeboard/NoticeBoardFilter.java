package drogenidesoftwares.drogenideschool.noticeboard;

import android.widget.Filter;

import java.util.ArrayList;

/**
 * Created by Hp on 3/17/2016.
 */
public class NoticeBoardFilter extends Filter {

    NoticeBoardAdapter adapter;
    ArrayList<NoticeBoardModel> filterList;


    public NoticeBoardFilter(ArrayList<NoticeBoardModel> filterList, NoticeBoardAdapter adapter)
    {
        this.adapter=adapter;
        this.filterList=filterList;

    }

    //FILTERING OCURS
    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results=new FilterResults();

        //CHECK CONSTRAINT VALIDITY
        if(constraint != null && constraint.length() > 0)
        {
            //CHANGE TO UPPER
            constraint=constraint.toString().toUpperCase();
            //STORE OUR FILTERED PLAYERS
            ArrayList<NoticeBoardModel> filteredPlayers=new ArrayList<>();

            for (int i=0;i<filterList.size();i++)
            {
                //CHECK
                if(filterList.get(i).getNoticeDate().toUpperCase().contains(constraint))
                {
                    //ADD PLAYER TO FILTERED PLAYERS
                    filteredPlayers.add(filterList.get(i));
                }
            }

            results.count=filteredPlayers.size();
            results.values=filteredPlayers;
        }else
        {
            results.count=filterList.size();
            results.values=filterList;

        }


        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {

       adapter.itemList = (ArrayList<NoticeBoardModel>) results.values;

        //REFRESH
        adapter.notifyDataSetChanged();
    }
}

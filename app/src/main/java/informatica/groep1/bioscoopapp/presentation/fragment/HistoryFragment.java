//================================================================================
// This class is made by:
// - Thimo Koolen
//================================================================================

package informatica.groep1.bioscoopapp.presentation.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import informatica.groep1.bioscoopapp.R;
import informatica.groep1.bioscoopapp.adapter.HistoryImageAdapter;
import informatica.groep1.bioscoopapp.businesslogic.HistoryFilmManager;
import informatica.groep1.bioscoopapp.domain.Movie;

public class HistoryFragment extends Fragment {
	
	private HistoryFilmManager manager;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_account_history, container, false);
		
		manager = new HistoryFilmManager();
		
		manager.generate();
		
		GridView gridView = (GridView) rootView.findViewById(R.id.historyFragment_GV_grid);
		if (gridView != null) {
			gridView.setAdapter(new HistoryImageAdapter(getActivity(), manager.getMovies()));
			gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
					Movie movie = manager.getMovies().get(position);
					Log.i("Fragment History", movie.getTitle());
				}
			});
		}
		
		return rootView;
	}
}

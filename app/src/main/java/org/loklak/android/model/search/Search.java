package org.loklak.android.model.search;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Search {

    private SearchMetadata mSearchMetadata;
    private List<Status> mStatuses = null;
    private List<String> aggregations;

    public void setStatuses(List<Status> statuses) {
        this.mStatuses = statuses;
    }

    public List<Status> getStatuses() {
        return mStatuses;
    }
}

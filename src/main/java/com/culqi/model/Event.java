package com.culqi.model;

import com.culqi.apioperation.All;
import com.culqi.apioperation.Find;
import com.culqi.util.ObjectResult;

import java.util.Map;

/**
 * Created by culqi on 12/02/17.
 */
public class Event implements All, Find {

    private static final String URL = "/events/";

    public Map<String, Object> list(Map<String, Object> params) throws Exception {
        params = (params == null || params.size() == 0) ? null: params;
        return new ObjectResult().list(this.URL.replace("/",""), params);
    }

    public Map<String, Object> list() throws Exception {
        return new ObjectResult().list(this.URL.replace("/",""), null);
    }

    public Map<String, Object> get(String id) throws Exception {
        return new ObjectResult().get_or_delete(this.URL, id, false);
    }

}

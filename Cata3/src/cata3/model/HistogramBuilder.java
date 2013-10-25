/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cata3.model;

import cata3.model.Histogram;

/**
 *
 * @author usuario
 */
public class HistogramBuilder<Key> {
    Histogram<Key> histogram= new Histogram<>();
    public Histogram calculateHistogram(Key [] array){
        
        for (Key key : array) {
           histogram.put(key,getFrecuency(key)+1);
        }
        return histogram;
    }

    private Integer getFrecuency(Key key) {
        Integer frequency=histogram.get(key);
        if(frequency==null){
            return 0;
        }
        return frequency;
    }

    public Histogram getHistogram() {
        return histogram;
    }
}

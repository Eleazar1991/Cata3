/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cata3.viewer;

import cata3.model.Histogram;

/**
 *
 * @author usuario
 */
public class HistogramViewer<Key> {
    Histogram <Key> histogram;

    public HistogramViewer(Histogram histogram) {
        this.histogram = histogram;
    }
    public void show(){
        for (Key key : histogram.keySet()) {
            System.out.println(key+ ":"+histogram.get(key));
        }
    }
}

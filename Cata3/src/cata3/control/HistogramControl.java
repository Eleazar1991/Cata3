/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cata3.control;

import cata3.model.HistogramBuilder;
import cata3.viewer.HistogramViewer;

/**
 *
 * @author usuario
 */
public class HistogramControl<Key> {
   public void execute(Key[] array){
        HistogramBuilder<Key> builder=new HistogramBuilder<>();
        builder.calculateHistogram(array);
        HistogramViewer<Key> viewer=new HistogramViewer(builder.getHistogram());
        viewer.show();    
   }    
}

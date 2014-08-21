/**
 *
 */
package com.stratio.deep.extractor.actions;

import com.stratio.deep.config.ExtractorConfig;
import com.stratio.deep.rdd.DeepTokenRange;

/**
 * @author Óscar Puertas
 */
public class InitIteratorAction<T> extends Action {

    private static final long serialVersionUID = -1270097974102584045L;

    private ExtractorConfig<T> config;


    private DeepTokenRange partition;

    public InitIteratorAction() {
        super();
    }

    public InitIteratorAction(DeepTokenRange partition, ExtractorConfig<T> config) {
        super(ActionType.INIT_ITERATOR);
        this.config = config;
        this.partition = partition;
    }


    public ExtractorConfig<T> getConfig() {
        return config;
    }

    public DeepTokenRange getPartition() {
        return partition;
    }
}

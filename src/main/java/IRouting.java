import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.ObjectMatrix2D;

import java.util.List;
import java.util.stream.Stream;


/**
 * routing interface
 */
public interface IRouting
{

    /**
     * runs the initialization process from the environment
     *
     * @param p_objects full initialized environment grid (static elements)
     * @return self reference
     */
    IRouting initialize(final ObjectMatrix2D p_objects);

    /**
     * routing algorithm
     *
     * @param p_objects object matrix
     * @param p_source current position
     * @param p_target target position
     * @return list of tuples of the cellindex
     */
    List<DoubleMatrix1D> route(final ObjectMatrix2D p_objects, final DoubleMatrix1D p_source, final DoubleMatrix1D p_target);

}

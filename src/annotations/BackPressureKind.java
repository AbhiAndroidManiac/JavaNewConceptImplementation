package annotations;
/*Completable -- full && UNBOUNDED_IN
  Flowable -- PASS_THROUGH && full
  Maybe -- full
  Single -- full &&  UNBOUNDED_IN
  ConnectableFlowable -- PASS_THROUGH
  ParallelFlowable -- FULL && SPECIAL && UNBOUNDED_IN
  are implemented in this class to provide categories*/
public enum BackPressureKind {
    PASS_THROUGH,
    FULL,
    SPECIAL,
    UNBOUNDED_IN,
    ERROR,
    NONE
}

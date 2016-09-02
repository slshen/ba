package ba;

public class EvaluationContext {
	private static final ThreadLocal<EvaluationContext> value = new ThreadLocal<EvaluationContext>() {
		@Override
		public EvaluationContext initialValue() {
			return new EvaluationContext();
		}
	};
	
	public static EvaluationContext get() {
		return value.get();
	}

	public void error(GeometryObject g, String message) {
		
	}
	

}

package feb_01_2021;
@FunctionalInterface
public interface TwoElementPredicate<T> {
	public boolean isFirstBetterThanSecond(T element1, T element2);
}

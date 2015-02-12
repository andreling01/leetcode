import java.util.*;
public class Solution {
	public List<Interval> merge(List<Interval> intervals) {
		if (intervals == null || intervals.size() <= 1)
			return intervals;

		// sort intervals by using self-defined Comparator
		Collections.sort(intervals, new IntervalComparator());

		ArrayList<Interval> result = new ArrayList<Interval>();

		Interval prev = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval curr = intervals.get(i);

			if (prev.end >= curr.start) {
				// merged case
				Interval merged = new Interval(prev.start, Math.max(prev.end, curr.end));
				prev = merged;
			} else {
				result.add(prev);
				prev = curr;
			}
		}

		result.add(prev);

		return result;
	}
}


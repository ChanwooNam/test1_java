package day09_tu;

@FunctionalInterface // 람다 판독기 -> 이게 허용되는 애들만 람다 사용 가능
public interface Command {
	void exec();
	// void process(); // 메소드 추가하면 원래는 전부 다시 오버라이딩 해야함
	default public void process() { // 그걸 날먹하는 default 메소드
		System.out.println("process()");
	}
}

class DeleteCommand implements Command {
	
	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("DeleteCommand 수행 ");
	}
}

class CreateCommand implements Command {
	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("CreateCommand 수행 ");
	}
}

class UpdateCommand implements Command {
	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("UpdateCommand 수행 ");
	}
}

class ListCommand implements Command {
	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("ListCommand 수행 ");
	}
}

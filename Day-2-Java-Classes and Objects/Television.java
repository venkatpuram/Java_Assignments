
public class Television {
	private boolean state;
	private int volume;
	private int channel;
		
	public boolean ModeTv(){
		if(isState()==true)
		{
			return true;
		}
		else
			return false;
	}
	
	 public int currentChannel()
	 {
		 if(isState()==true)
		 {
			 setChannel(channel);
		 }
		 return getChannel();
	 }
	 
	 public int currentVolume()
	 {
		 if(isState()==true)
		 {
			 setVolume(volume);
		 }
		 return getVolume();
	 }
	 public int channelIncrement()
	 {
		 if(isState()==true)
		 {
			 setChannel(getChannel() + 1);
		 }
		 return getChannel();
	 }
	 public int channelDecrement()
	 {
		 if(isState()==true)
		 {
			 setChannel(getChannel() - 1);
		 }
		 return getChannel();
	 }
	 public int volumeIncrement()
	 {
		 if(isState()==true)
		 {
			 setVolume(getVolume() + 1);
		 }
		 return getVolume();
	 }
	 public int volumeDecrement()
	 {
		 if(isState()==true)
		 {
			 setVolume(getVolume() - 1);
		 }
		 return getVolume();
	 }

	 public boolean changeState()
	 {
		 if(isState()==true)
		 {
			 return false;
		 }else
			 return isState();
	 }

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeerDiscovery;

import java.util.List;

/**
 *
 * @author arpaf
 */
public class HelloMessage {
	int senderID;
	int sequenceNumber;
	int HelloInterval;
	int NumPeers;
	List<Integer> peers;
}

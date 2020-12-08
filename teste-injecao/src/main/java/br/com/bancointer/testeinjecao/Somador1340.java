package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1340")
public class Somador1340 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}

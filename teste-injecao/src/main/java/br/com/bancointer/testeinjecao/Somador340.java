package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador340")
public class Somador340 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}

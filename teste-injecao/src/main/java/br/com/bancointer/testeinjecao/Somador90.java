package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador90")
public class Somador90 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}

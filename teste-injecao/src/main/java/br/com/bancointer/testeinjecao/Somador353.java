package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador353")
public class Somador353 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}

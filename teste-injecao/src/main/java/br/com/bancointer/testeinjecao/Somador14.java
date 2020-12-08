package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador14")
public class Somador14 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}

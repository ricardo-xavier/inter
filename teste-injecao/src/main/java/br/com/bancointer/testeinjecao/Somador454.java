package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador454")
public class Somador454 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
